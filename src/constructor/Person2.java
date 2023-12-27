package constructor;

public class Person2 {
    //normalde sadece parametresiz const veya parametresiz de olusturursak kalan tum fieldlari parametre olrak girmek opsiyonel olur,
    //eger en az bir field bile parametre olrak girmem gerekirse parametresiz const olmamali


        private String name;//zorunlu
        private String surname;//zorunlu
        private int age;//0--opsiyonel
        private String phoneNumber;//opsiyonel

        //getter-setter


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        //toString
        @Override
        public String toString() {
            return "Person2{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", age=" + age +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    '}';
        }

        //Person2Builder classinin objesini burada method ile olusturslim
        public static Person2Builder builder(){
            return new Person2Builder();
        }


    public static void main(String[] args) {
        //builder kullanarak person2 objesi oliusturalim
        Person2 person2=Person2.builder().addName("Harry").addSurName("Potter").build();
        //Person2.builder()-->person2 objesi olustururken Person2 classindaki builder() methodunu cagirdik
        //bu method bize Person2Builder dondurdugu icin bununla da Person2Builderdaki addName,addSurName gibi methodlari cagirabildik
        //mormalde addName() methodu static olmadigi icin onu cagirabilmek icin icinde bulundugu classdan(Person2Builder) obje uretip obje.methodname diyerek kullanabiliyorduk
        //burada Person2.builder()-->Person2 classindaki builder methodunu cagirdik ve bu method bize zaten bir Person2Builder dondurdugu icin,
        //Person2Builder dan tekrar obje uretmeden ordaki non-static methodlara ulasabildim
        //en son build() methodunu kullandik ki bize Person2 objesi dondursun
        //Person2Builder x=new Person2Builder deseydim;
        //Person2Builder classdan x oadinda obje uretmis ve bu objesnin Person2 turunde bir fieldi ve addName gibi methodlari olurdu

  /*
    Builder dizayn pattern icin once pojo classi(fieldlar, getter+setter and toString) olusturuyiorum
    Normalde pojo classin bir objesini olusturabilmek icin constructor kullaniyorduk--Person classda oldugu gibi
    Builder dizayn pattern'da ise once obje olusturucu ayri bir class olusturuyorum(Person2Builder gibi)
    Bu builder classda obje olusturmak istedigimiz classdan bos bir obje olustuyorum-->private Person2 person2=new Person2();
    Yine builder classda bu bos objenin her bir degerini set eden methodlar olusturduk addName() gibi

     */

        Person2 person3 =Person2.builder().addName("Sherlock").addSurName("Holmes").
                                        addAge(53).addPhoneNumber("12345").build();
        System.out.println(person3);

        Person2 person4=Person2.builder().addName("ali").addAge(67).addSurName("Can").build();
        //istedigimiz sirada yazabiliriz, istedigimiz kadar kombinasyon yapabiliriz
        //normalde her kombinasyona gore constrructor olusturmamis gerekiyordu dizayn pattern ile gerek kalmadi
        System.out.println(person4);
    }


    }



    