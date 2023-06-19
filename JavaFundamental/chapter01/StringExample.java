public class StringExample {
    public static void main(String[] args) {
        String str = "나는 \"자바\"를 배웁니다.";
        System.out.println(str);
        str = "번호\t이름\n직업";
        System.out.println(str);

        String str1 = "{\n" + 
                      "\t\"id\" : \"winter\", \n" +
                      "\t\"name\":\"눈송이\"\n" +
                      "}";

        String str2 = """
            {
             "id" : "winter",\
             "name" : "눈송이"
            }
                      """;

        System.out.println(str1);
        System.out.println("--------------------------------------------");
        System.out.println(str2);
        System.out.println("--------------------------------------------");        
}
}

