public class Contact {
    String name,mobileNumber;
    Contact(String n,String m)
    {
        name=n;
        mobileNumber=m;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}
