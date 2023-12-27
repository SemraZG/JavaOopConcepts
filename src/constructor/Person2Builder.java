package constructor;
//builder classı Person2 objesinin üretimindeki süreci yönetmemizi sağlar--->obje olusturucu class
public class Person2Builder {

    private Person2 person2=new Person2();//person2 Person2 data tipinde bos bir obje ve ayni zamanda Person2Builder'in bir fieldi
//person2==Person2Builder'in icin bos olan bir objeden olusan fieldi
    public Person2Builder addName(String name){//-->addName methodunun data tipi Person2Builder
        this.person2.setName(name);//yukaridaki person2 objesinin bos olan name'ine atama yaptik
        return this;//return this--> icinde person2 objesi olan bir Person2Builder dondurecek, bu classin objesi yani Person2Builder donecek dmek
    }

    public Person2Builder addSurName(String surname){
        this.person2.setSurname(surname);
        return this;
    }

    public Person2Builder addAge(int age){
        person2.setAge(age);
        return this;
    }

    public Person2Builder addPhoneNumber(String phone){
        person2.setPhoneNumber(phone);
        return this;
    }

    public Person2 build(){
        //builder nesnesi person2 objesini oluşturucak fakat name ve surname zorunlu
        if (person2.getName()==null || person2.getSurname()==null){
            throw new IllegalStateException("Name ve surname zorunludur!!!");//kendimiz exeption firlattik
        }
        return this.person2;
    }

}
