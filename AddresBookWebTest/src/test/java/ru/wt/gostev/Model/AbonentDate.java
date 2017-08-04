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
    private String group;

    public AbonentDate(String firstAbonentName, String lastAbonentName, String companyName,
                       String addressAbonent, String homePhoneNumber, String mobilePhoneNumber,
                       String workPhoneNumber, String faxNumber, String emailAbonent,
                       String homePageAbonent, String group) {
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
        this.group = group;
    }

    @Override
    public String toString() {
        return "AbonentDate{" +
                "firstAbonentName='" + firstAbonentName + '\'' +
                ", lastAbonentName='" + lastAbonentName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", addressAbonent='" + addressAbonent + '\'' +
                ", homePhoneNumber='" + homePhoneNumber + '\'' +
                ", mobilePhoneNumber='" + mobilePhoneNumber + '\'' +
                ", workPhoneNumber='" + workPhoneNumber + '\'' +
                ", faxNumber='" + faxNumber + '\'' +
                ", emailAbonent='" + emailAbonent + '\'' +
                ", homePageAbonent='" + homePageAbonent + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbonentDate that = (AbonentDate) o;

        if (firstAbonentName != null ? !firstAbonentName.equals(that.firstAbonentName) : that.firstAbonentName != null)
            return false;
        if (lastAbonentName != null ? !lastAbonentName.equals(that.lastAbonentName) : that.lastAbonentName != null)
            return false;
        if (companyName != null ? !companyName.equals(that.companyName) : that.companyName != null) return false;
        if (addressAbonent != null ? !addressAbonent.equals(that.addressAbonent) : that.addressAbonent != null)
            return false;
        if (homePhoneNumber != null ? !homePhoneNumber.equals(that.homePhoneNumber) : that.homePhoneNumber != null)
            return false;
        if (mobilePhoneNumber != null ? !mobilePhoneNumber.equals(that.mobilePhoneNumber) : that.mobilePhoneNumber != null)
            return false;
        if (workPhoneNumber != null ? !workPhoneNumber.equals(that.workPhoneNumber) : that.workPhoneNumber != null)
            return false;
        if (faxNumber != null ? !faxNumber.equals(that.faxNumber) : that.faxNumber != null) return false;
        if (emailAbonent != null ? !emailAbonent.equals(that.emailAbonent) : that.emailAbonent != null) return false;
        if (homePageAbonent != null ? !homePageAbonent.equals(that.homePageAbonent) : that.homePageAbonent != null)
            return false;
        return group != null ? group.equals(that.group) : that.group == null;
    }

    @Override
    public int hashCode() {
        int result = firstAbonentName != null ? firstAbonentName.hashCode() : 0;
        result = 31 * result + (lastAbonentName != null ? lastAbonentName.hashCode() : 0);
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (addressAbonent != null ? addressAbonent.hashCode() : 0);
        result = 31 * result + (homePhoneNumber != null ? homePhoneNumber.hashCode() : 0);
        result = 31 * result + (mobilePhoneNumber != null ? mobilePhoneNumber.hashCode() : 0);
        result = 31 * result + (workPhoneNumber != null ? workPhoneNumber.hashCode() : 0);
        result = 31 * result + (faxNumber != null ? faxNumber.hashCode() : 0);
        result = 31 * result + (emailAbonent != null ? emailAbonent.hashCode() : 0);
        result = 31 * result + (homePageAbonent != null ? homePageAbonent.hashCode() : 0);
        result = 31 * result + (group != null ? group.hashCode() : 0);
        return result;
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

    public String getGroup() {
        return group;
    }
}
