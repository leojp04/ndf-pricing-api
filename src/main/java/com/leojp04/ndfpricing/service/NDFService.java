package com.leojp04.ndfpricing.service;

import com.leojp04.ndfpricing.dto.NDFRequestDTO;
import com.leojp04.ndfpricing.dto.NDFResponseDTO;
import com.leojp04.ndfpricing.enums.Side;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class NDFService {


    public NDFResponseDTO calculate(NDFRequestDTO requestDTO){
        double spot = requestDTO.getSpotRate().doubleValue();
        double brl = requestDTO.getBrlRate().doubleValue()/100;
        double fxCoupon = requestDTO.getFxCoupon().doubleValue()/100;
        double calendarDays = requestDTO.getCalendarDays();
        double businessDays = requestDTO.getBusinessDays();
        double numerator = Math.pow(1+brl, businessDays /252  );
        double denominator = (1+fxCoupon* calendarDays /360);

        BigDecimal forwardRate = BigDecimal.valueOf(spot * numerator/denominator).setScale(4, RoundingMode.HALF_UP);

        BigDecimal clientRate;
                if(requestDTO.getSide() == Side.BUY) {
                    clientRate = forwardRate.add(requestDTO.getSpread());
                }else {
                    clientRate = forwardRate.subtract(requestDTO.getSpread());
                }
        BigDecimal rateSpread;
                if(requestDTO.getSide() == Side.BUY) {
                    rateSpread = clientRate.subtract(forwardRate).setScale(4, RoundingMode.HALF_UP);
                } else {
                    rateSpread = forwardRate.subtract(clientRate).setScale(4, RoundingMode.HALF_UP);
                }
        int spreadInPoints = rateSpread.multiply(BigDecimal.valueOf(10000)).intValue();

        BigDecimal financialPnL = requestDTO.getNotional().multiply(rateSpread).setScale(2, RoundingMode.HALF_UP);

        return new NDFResponseDTO(forwardRate, clientRate, rateSpread, spreadInPoints, financialPnL);

    }

}
