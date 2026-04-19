package com.leojp04.ndfpricing.dto;

import com.leojp04.ndfpricing.enums.Side;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public class NdfRequestDTO {

    private BigDecimal spotRate;
    private BigDecimal brlRate;
    private BigDecimal fxCoupon;
    private int businessDays;
    private int calendarDays;
    private Side side;
    private BigDecimal spread;
    private BigDecimal notional;

    public NdfRequestDTO() {
    }

    public NdfRequestDTO(BigDecimal spotRate, BigDecimal brlRate, BigDecimal fxCoupon, int businessDays, int calendarDays, Side side, BigDecimal spread, BigDecimal notional) {
        this.spotRate = spotRate;
        this.brlRate = brlRate;
        this.fxCoupon = fxCoupon;
        this.businessDays = businessDays;
        this.calendarDays = calendarDays;
        this.side = side;
        this.spread = spread;
        this.notional = notional;
    }

    public BigDecimal getSpotRate() {
        return spotRate;
    }

    public void setSpotRate(BigDecimal spotRate) {
        this.spotRate = spotRate;
    }

    public BigDecimal getBrlRate() {
        return brlRate;
    }

    public void setBrlRate(BigDecimal brlRate) {
        this.brlRate = brlRate;
    }

    public BigDecimal getFxCoupon() {
        return fxCoupon;
    }

    public void setFxCoupon(BigDecimal fxCoupon) {
        this.fxCoupon = fxCoupon;
    }

    public int getBusinessDays() {
        return businessDays;
    }

    public void setBusinessDays(int businessDays) {
        this.businessDays = businessDays;
    }

    public int getCalendarDays() {
        return calendarDays;
    }

    public void setCalendarDays(int calendarDays) {
        this.calendarDays = calendarDays;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public BigDecimal getSpread() {
        return spread;
    }

    public void setSpread(BigDecimal spread) {
        this.spread = spread;
    }

    public BigDecimal getNotional() {
        return notional;
    }

    public void setNotional(BigDecimal notional) {
        this.notional = notional;
    }
}
