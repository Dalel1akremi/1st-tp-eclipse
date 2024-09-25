package rappel;

public interface EmployeARisque {
	 double PRIME_DE_RISQUE = 200.0;
    default double getPrime() {
        return PRIME_DE_RISQUE;
    }
}
