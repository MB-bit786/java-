// 3. Compare strings
class CompareExample {
    public static void main(String[] args) {
        String s1 = "topsint.com";
        String s2 = "topsint.com";
        String s3 = "Topsint.com";
        System.out.println(s1.contentEquals(s2));
        System.out.println(s3.contentEquals(s2));
    }
}
