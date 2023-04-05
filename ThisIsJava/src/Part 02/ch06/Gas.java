public class Gas {
    int gas;

    void setGas(int gas) {
        this.gas = gas;
    }
    // return 타입
    boolean isLeftGas() {
        if (gas==0) {
            System.out.println("gas기 없습니다.");
            return false;
        }
        System.out.println("gas가 있습니다.");
        return true;
    }

    void run() {
        while(true) {
            if(gas > 0) {
                System.out.println("달립니다.(gas 잔량: " + gas + ")");
                gas -= 1;
            } else {
                System.out.println("멈춥니다.(gas 잔량: " + gas + ")");
                break;   // 메소드 종료
            }
        }
    }
}