/**
 * This class creates 2 objects and tell if the state is with "no -fault" auto insurance.
 */
public class AutoPolicyTest {
    public static void main(String[] args) {
        AutoPolicy policy1 = new AutoPolicy(1111111,"Toyota Camry","NJ");
        AutoPolicy policy2 = new AutoPolicy(2222222,"Ford Fusion","ME");

        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }

    public static void policyInNoFaultState(AutoPolicy policy){
        policy.isNoFaultState();
        System.out.printf("%nThe auto policy of %d %s is held in %s, and %s in no-fault auto insurance state.",
                policy.getAccountNumber(),policy.makeAndModel,policy.getState(),(policy.isNoFaultState())?"is":"is not");
    }
}
