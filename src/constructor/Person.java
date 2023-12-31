package constructor;

    //pojo classlarda genelde wrapper class(Integer, Double...)gibi
    //orn: yasi int yaparsaksak deger atamadigimzida 0 olur,
    // Integer yaparsak yasi girmedigimizde yas null olur ve daha mantikli olur

//normalde sadece parametresiz const veya parametresiz de olusturursak kalan tum fieldlari parametre olrak girmek opsiyonel olur,
//eger en az bir field bile parametre olrak girmem gerekirse parametresiz const olmamali
    public class Person {//POJO

        //private Integer age;//null; bazı senaryolarda 0 dewfault değeri anlam ifade eder,
        //bunun yerine dğer içermeyen null olsun isteriz

        private String name;//zorunlu
        private String surname;//zorunlu
        private int age;//0--opsiyonel
        private String phoneNumber;//opsiyonel

        //paramsız const
//    public Person() {
//    }

        //2 parametreli constructor
        public Person(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        //3 parametreli constructor
        public Person(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        //4  parametreli constructor
        public Person(String name, String surname, int age, String phone) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.phoneNumber = phone;
        }


        public static void main(String[] args) {

            //Person person0=new Person();
            Person person = new Person("Jack", "Sparrow");
            Person person2 = new Person("Jack", "Sparrow", 45);
            Person person3 = new Person("Jack", "Sparrow", 45, "12345678");

            //burada farklı  parametreler ile const oluşturmanın alternatifi var mıdır?--->Person2 Classi


        }


    }
