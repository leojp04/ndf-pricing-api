package com.leojp04.ndfpricing.dto;

import java.math.BigDecimal;

public class NDFResponseDTO {

    private BigDecimal forwardRate;
    private BigDecimal clientRate;
    private BigDecimal rateSpread;
    private int spreadInPoints;
    private BigDecimal financialPnL;

    public NDFResponseDTO() {
    }

    public NDFResponseDTO(BigDecimal forwardRate, BigDecimal clientRate, BigDecimal rateSpread, int spreadInPoints, BigDecimal financialPnL) {
        this.forwardRate = forwardRate;
        this.clientRate = clientRate;
        this.rateSpread = rateSpread;
        this.spreadInPoints = spreadInPoints;
        this.financialPnL = financialPnL;
    }

    public BigDecimal getForwardRate() {
        return forwardRate;
    }

    public void setForwardRate(BigDecimal forwardRate) {
        this.forwardRate = forwardRate;
    }

    public BigDecimal getClientRate() {
        return clientRate;
    }

    public void setClientRate(BigDecimal clientRate) {
        this.clientRate = clientRate;
    }

    public BigDecimal getRateSpread() {
        return rateSpread;
    }

    public void setRateSpread(BigDecimal rateSpread) {
        this.rateSpread = rateSpread;
    }

    public int getSpreadInPoints() {
        return spreadInPoints;
    }

    public void setSpreadInPoints(int spreadInPoints) {
        this.spreadInPoints = spreadInPoints;
    }

    public BigDecimal getFinancialPnL() {
        return financialPnL;
    }

    public void setFinancialPnL(BigDecimal financialPnL) {
        this.financialPnL = financialPnL;
    }
}
