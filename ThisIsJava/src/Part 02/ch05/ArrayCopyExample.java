public class ArrayCopyExample {
    public static void main(String[] args) {
       String[] oldArray = new String[3];
       oldArray[0] = "eru";
       oldArray[1] = "is";
       oldArray[2] = "cute";

       String[] newArray = new String[5];
       System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
       // 항목의 값이 String 객체의 번지이므로 번지 복사가 되어 참조하는 String 객체는 변함이 없다.

       for(int i = 0; i < newArray.length; i++) {
        System.out.println(newArray[i]);
       }
    }  
}