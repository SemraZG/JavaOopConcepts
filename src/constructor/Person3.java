package constructor;

import lombok.Builder;
import lombok.NonNull;

@Builder
public class Person3 {
    //builder DP'yi kuallanalim ama bu defa hazir kutuphaneden alalim
    @NonNull//fieldin ustunde kullanildiginda bu field null olamaz demek
    private String name;//zorunlu
    @NonNull
    private String surname;//zorunlu
    private int age;//0--opsiyonel
    private String phoneNumber;//opsiyonel


    public static void main(String[] args) {
        Person3 person=Person3.builder().name("Veli").surname("Han").age(43).build();
        Person3 person2=Person3.builder().name("Ali").surname("Hanli").build();
    }

}
