import java.util.Scanner;

public class PYP_project {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        byte major, major1, major2 ,major3,  agreen;
        float GBA;
        String f_name, s_name, th_name, uni_name, uni_name2, uni_name3;
        int ID;
        System.out.println("مرحبا بك في مرحلة القبول المبدئي");

        System.out.println("فضلا ادخل اسم جامعتك الأول");
        uni_name = read.next();

        System.out.println("ادخل اسم جامعتك الثاني");
        uni_name2 = read.next();

        System.out.println("ادخل اسم جامعتك الاخير");
        uni_name3 = read.next();

        System.out.println("ادخل اسمك الأول من فضلك ");
        f_name = read.next();

        System.out.println("ادخل اسمك الثاني من فضلك ");
        s_name = read.next();

        System.out.println("ادخل اسمك الأخير من فضلك ");
        th_name = read.next();

        System.out.println("فضلا ادخل رقم الهوية الوطنية");
        ID = read.nextInt();

        System.out.println("اذا كنت متأكد من اسم جامعتك وهي " + " " + uni_name + " " + uni_name2 + " " + uni_name3);
        System.out.println(f_name + " " + s_name + " " + th_name + " " + ID + " " + "واذا كان هذا اسمك " + " وكانت هذه هويتك فاكتب رقم 1");
        agreen = read.nextByte();
        if (agreen == 1)
            System.out.println("فضلا اختر تخصصك من التخصصات أدناه");
        System.out.println("1- تخصصات الهندسة");
        System.out.println("2- تخصصات ادارة الأعمال");
        System.out.println("3- تخصصات الحاسب");

        major = read.nextByte();

        switch (major) {
            case 1 -> {
                System.out.println("فضلا قم باختيار تخصصك");
                System.out.println("1- الهندسة الكهربائية");
                System.out.println("2- الهندسة الميكانية");
                System.out.println("3- الهندسة المدنية");
                System.out.println("4- الهندسة المعمارية");
                System.out.println("5- الهندسة الكيميائية");
                System.out.println("6- الهندسة النووية");
                major1 = read.nextByte();
                switch (major1) {
                    case 1 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 4.10) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");

                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    case 2 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 4.50) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");

                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    case 3 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 4.78) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");

                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    case 4 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 4.15) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");

                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    case 5 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 4.20) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");

                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    case 6 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 4.12) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");

                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    default -> System.out.println("خيار خاطئ");
                }


            }

            case 2 -> {
                System.out.println("فضلا اختر تخصصك من التخصصات ادناه");
                System.out.println("1- المحاسبة");
                System.out.println("2- نظم المعلومات ألإدارية");
                System.out.println("3- الإدارة الصحية");
                System.out.println("4- الإدارة العامة");
                System.out.println("5- الإقتصاد ");
                System.out.println("6- التسويق");
                System.out.println("7- الإدارة المالية");
                major2 = read.nextByte();
                switch (major2) {
                    case 1 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 3.22) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");
                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    case 2 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 3.09) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");
                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    case 3 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 3.01) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");
                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    case 4 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 3.04) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");
                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    case 5 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 3.07) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");
                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    case 6 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 3.02) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");
                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    case 7 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 3.44) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");
                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    default -> System.out.println(" خيار خاطئ");
                }
            }
            case 3 -> {
                System.out.println("فضلا اختر تخصصك من القائمة ادناه");
                System.out.println("1- هندسة الحاسب");
                System.out.println("2- هندسة البرمجيات");
                System.out.println("3- علوم الحاسب");
                System.out.println("4- تقنية المعلومات");
                major3 = read.nextByte();
                switch (major3) {
                    case 1 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 4.08) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");
                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }

                    }
                    case 2 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 4.00) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");
                        } else {
                            System.out.println("نعتذر لعدم قبولك");

                        }
                    }
                    case 3 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 4.07) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");
                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }
                    }
                    case 4 -> {
                        System.out.println("فضلا ادخل معدلك الجامعي");
                        GBA = read.nextFloat();
                        if (GBA >= 4.01) {
                            System.out.println(f_name + " " + s_name + " " + th_name + " " + " مبروك عليك عديت مرحلة القبول المبدئي , الان انتظر موعد المقابلة الشخصية");
                        } else {
                            System.out.println("نعتذر لعدم قبولك");
                        }

                    }
                    default -> System.out.println("خيار خاطئ");
                }
            }
        }

    }
}
