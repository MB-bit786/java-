// 5. Interleaving strings
class Interleave {
    static void interleave(String s1, String s2, String res) {
        if (s1.length() == 0 && s2.length() == 0) {
            System.out.println(res);
            return;
        }
        if (s1.length() > 0)
            interleave(s1.substring(1), s2, res + s1.charAt(0));
        if (s2.length() > 0)
            interleave(s1, s2.substring(1), res + s2.charAt(0));
    }
    public static void main(String[] args) {
        interleave("WX", "YZ", "");
    }
}