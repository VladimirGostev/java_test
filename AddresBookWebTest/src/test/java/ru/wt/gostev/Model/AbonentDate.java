package ru.wt.gostev.Model;

public class AbonentDate {
    private final String firstAbonentName;
    private final String lastAbonentName;
    private final String companyName;
    private final String addressAbonent;
    private final String homePhoneNumber;
    private final String mobilePhoneNumber;
    private final String workPhoneNumber;
    private final String faxNumber;
    private final String emailAbonent;
    private final String homePageAbonent;

    public AbonentDate(String firstAbonentName, String lastAbonentName, String companyName,
                       String addressAbonent, String homePhoneNumber, String mobilePhoneNumber,
                       String workPhoneNumber, String faxNumber, String emailAbonent,
                       String homePageAbonent) {
        this.firstAbonentName = firstAbonentName;
        this.lastAbonentName = lastAbonentName;
        this.companyName = companyName;
        this.addressAbonent = addressAbonent;
        this.homePhoneNumber = homePhoneNumber;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.workPhoneNumber = workPhoneNumber;
        this.faxNumber = faxNumber;
        this.emailAbonent = emailAbonent;
        this.homePageAbonent = homePageAbonent;
    }

    public String getFirstAbonentName() {
        return firstAbonentName;
    }

    public String getLastAbonentName() {
        return lastAbonentName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddressAbonent() {
        return addressAbonent;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public String getEmailAbonent() {
        return emailAbonent;
    }

    public String getHomePageAbonent() {
        return homePageAbonent;
    }
}
