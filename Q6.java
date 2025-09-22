public class Q6 {

    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank axis = new AXIS();

        System.out.println("SBI Rate of Interest : " + sbi.getRateOfInterest());
        System.out.println("ICICI Rate of Interest : " + icici.getRateOfInterest());
        System.out.println("AXIS Rate of Interest : " + axis.getRateOfInterest());
    }
}

class Bank {
    public float getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    public float getRateOfInterest() {
        return 8.0f;
    }
}

class ICICI extends Bank {
    @Override
    public float getRateOfInterest() {
        return 7.0f;
    }
}

class AXIS extends Bank {
    @Override
    public float getRateOfInterest() {
        return 9.0f;
    }
}