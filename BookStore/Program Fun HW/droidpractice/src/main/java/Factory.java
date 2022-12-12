public class Factory {
    private Droid[] droids;
    private int capacity = 10;
    private String company;
    private int count;

    public Factory(String company) {
        if (company == null || company.isBlank())
            this.company = "KMUTT";
        else
            this.company = company;
        droids = new Droid[capacity];
    }

    public Droid[] getDroids() {
        return droids;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getCompany() {
        return company;
    }

    public boolean createDroid(String name) {
        if (count == capacity || name == null || name.isBlank())
            return false;
        else {
            droids[count] = new Droid(name);
            count++;
            return true;
        }
    }

    public int[] getAllVersion() {
        int[] gav = new int[count];
        for (int i = 0; i < count; i++)
            gav[i] = droids[i].getVersion();
        return gav;
    }

    public Droid getDroid(int version) {
        for (int i = 0; i < count; i++) {
            if (droids[i].getVersion() == version)
                return droids[i];
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("%s : %d", company, capacity);
    }
}
