class Solution {
    public int countSegments(String s) {
        if (s == null || s.length() == 0) return 0;
        String[] parts = s.trim().split("\\s+");
        return parts.length == 1 && parts[0].equals("") ? 0 : parts.length;
    }
}
