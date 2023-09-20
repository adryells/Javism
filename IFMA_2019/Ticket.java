package IFMA_2019;


public class Ticket {
    public static void main(String[] args) {
        System.out.println("Initializing...");
    }

    private static int Value;

    public void showValue() {
        Ticket.Value = 200;
        System.out.println(Value);
    }

    public static class Vip extends Ticket {
        @Override
        public void showValue() {
            long sVip = Ticket.Value + 20;
            System.out.println(sVip);
        }
    }

    static class CamInf extends Vip {
        String local;

        public String getLocal() {
            return this.local;
        }

        public void setLocal(String local) {
            this.local = local;
        }

        class CamSup extends Vip {
            public void showValue(long sVip) {
                long SupVip = sVip + 30;
                System.out.println(sVip);
                System.out.println(SupVip);
            }
        }
    }
}
