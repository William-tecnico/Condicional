package united;

public class united {
    public static void main(String[] args) {

        ifflecha();
        ifsemflecha();
        ifferias();
        ifmenor();


    }

    private static void ifflecha() {
    }


    private static void ifmenor() {

    }

    private static void ifferias() {
    }

    private static void ifsemflecha() {
        int mês = 9;
        if (mês == 1) {
            System.out.println("Janeiro");
        } else {
            if (mês == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mês == 3) {
                    System.out.println("Março");
                } else {
                    if (mês == 4) {
                        System.out.println("Abril");
                    } else {
                        if (mês == 5) {
                            System.out.println("Maio");
                        } else {
                            if (mês == 6) {
                                System.out.println("Junho");
                            } else {
                                if (mês == 7) {
                                    System.out.println("Julho");
                                } else {
                                    if (mês == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (mês == 9) {
                                            System.out.println("setembro");
                                        } else {
                                            if (mês == 10) {
                                                System.out.println("outubro");
                                            } else {
                                                if (mês == 11) {
                                                    System.out.println("novembro");
                                                } else {
                                                    if (mês == 12) {
                                                        System.out.println("Dezembro");
                                                    } else System.out.println("Deu Ruim");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}