// 6. Second most frequent character
class SecondMost {
    public static void main(String[] args) {
        String str = "successes";
        int[] freq = new int[256];
        for (char c : str.toCharArray()) freq[c]++;
        int first = 0, second = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > freq[first]) {
                second = first;
                first = i;
            } else if (freq[i] > freq[second] && freq[i] != freq[first]) {
                second = i;
            }
        }
        System.out.println((char) second);
    }
}