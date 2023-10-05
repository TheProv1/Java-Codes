import java.util.*;

class Process
{
        int dirhams;
        int fils_50, fils_25;
}

class Money
{
        private static Scanner sc = new Scanner(System.in);
        private static Process p = new Process();

        public static void main(String args[])
        {

                for (int i = 0; i < 100; i++)
                {
                        System.out.print("\n\n\n\n\t\t\t\tMain Menu\n\n1. Dirhams operation\n2. 25 Fils Operation\n3. 50 fils operation\n4. View Balance\n5. Exit\nEnter your choice: ");
                        int main_opt = sc.nextInt();

                        switch (main_opt)
                        {
                                case 1:
                                        {
                                                dir_op();
                                                break;
                                        }

                                case 2:
                                        {
                                                fil25_op();
                                                break;
                                        }

                                case 3:
                                        {
                                                fil50_op();
                                                break;
                                        }

                                case 4:
                                        {
                                                total();
                                                break;
                                        }

                                case 5:
                                        {
                                                i = 100;
                                        }

                        }
                }

        }

        static void dir_op()
        {
                System.out.print("\n\nDirhams Menu\n\n1. Credit Dirhams\n2. Debit Dirhams\n\nEnter your choice: ");
                int dir_opt = sc.nextInt();
                switch (dir_opt)
                {
                        case 1:
                                {
                                        System.out.print("\nEnter the amount of Dhs Credited: ");
                                        int dir_add = sc.nextInt();
                                        add_dirham(dir_add);
                                        break;
                                }

                        case 2:
                                {
                                        System.out.print("\nEnter the amount of Dhs Debited: ");
                                        int dir_rem = sc.nextInt();
                                        remove_dirham(dir_rem);
                                        break;
                                }
                }
        }


        static void fil25_op()
        {
                System.out.print("\n\nDirhams Menu\n\n1. Credit 25 fils\n2. Debit 25 fils\n\nEnter your choice: ");
                int fil25_opt = sc.nextInt();
                switch (fil25_opt)
                {
                        case 1:
                                {
                                        System.out.print("\nEnter the number of 25 fils Credited: ");
                                        int count_25f_add = sc.nextInt();
                                        add_fils_25(count_25f_add);
                                        break;
                                }

                        case 2:
                                {
                                        System.out.print("\nEnter the number of 25 fils Debited: ");
                                        int count_25f_rem = sc.nextInt();
                                        remove_fils_25(count_25f_rem);
                                        break;
                                }
                }
        }


        static void fil50_op()
        {
                System.out.print("\n\nDirhams Menu\n\n1. Credit 50 fils\n2. Debit 50 fils\n\nEnter your choice: ");
                int fil50_opt = sc.nextInt();
                switch (fil50_opt)
                {
                        case 1:
                                {
                                        System.out.print("\nEnter the number of 50 fils Credited: ");
                                        int count_50f_add = sc.nextInt();
                                        add_dirham(count_50f_add);
                                        break;
                                }

                        case 2:
                                {
                                        System.out.print("\nEnter the number of 50 fils Debited: ");
                                        int count_50f_rem = sc.nextInt();
                                        remove_dirham(count_50f_rem);
                                        break;
                                }
                }
        }


        static void add_dirham(int add)
        {
                p.dirhams += add;
        }

        static void remove_dirham(int rem)
        {
                p.dirhams -= rem;
        }

        static void add_fils_25(int add_25)
        {
                p.fils_25 += (float)(add_25 * 0.25);
        }

        static void remove_fils_25(int rem_25)
        {
                p.fils_25 -= (float)(rem_25*0.25);
        }

        static void add_fils_50(int add_50)
        {
                p.fils_50 += (float)(add_50 * 0.5);
        }

        static void remove_fils_50(int rem_50)
        {
                p.fils_50 -= (float)(rem_50 * 0.5);
        }

        static void total()
        {
                float total = 0;
                total = p.fils_50 + p. fils_25 + p.dirhams;
                System.out.print("\nTotal: Dhs " + total);
        }


}
