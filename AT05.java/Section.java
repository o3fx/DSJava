public class Section {
    /* 
     *  This function takes in a section and strips off the leading section number
     */
    public static int leadingNumber(String section) {
        int val = 0;
        //find where the first dot/period is if any.
        int index = section.indexOf('.');
        if(index > 0) {
            // strip the symbols that represent the leading section number
            String expression = section.substring(0, index);
            val = Integer.valueOf(expression);
        } else if (index < 0) {
            // there is no period
            //assume the entire section is a single number
            val = Integer.valueOf(section);
        } else {
            // this is an error case
            // don't worry about it
        }
        return val;
    }
    // this method truncates a section if they are the same
    public static String truncateSection(String section) {
        int index = section.indexOf('.');
        String result = "";
        if (index >= 0) {
            if (index + 1 < section.length()) {
            result = section.substring(index + 1);
            } else {
                result = "";
            }
        } else {
            // no period we used up all the subsections
            result = "";
        }
        return result;
    }

    /*
     * This function takes two strings, and returns the string that should appear first
     */
    public static String whoIsFirst(String section1, String section2) {
        // make copies of sections of the string
        String work1 = section1;
        String work2 = section2;

        // we'll need to extract the leading section number
        int n1 = 0;
        int n2 = 0;
        // Loop untill we figure out is first
        while (true) {
            n1 = leadingNumber(work1);
            n2 = leadingNumber(work2);

            if (n1 < n2) {
                return section1;
            }

            if (n2 < n1) {
                return section2;
            }

            // if n1 and n2 are the same, remove the front leading number
            work1 = truncateSection(work1);
            work2 = truncateSection(work2);

            // did we use up all of the section numbers

            if (work1.isBlank()) {
                return section1;
            }
            if (work2.isBlank()) {
                return section2;
            }
        }
    }

    public static void main(String[] args) {
        String section1 =  "1.2.2";
        String section2 = "1.2";
    
        System.out.println("Section " + whoIsFirst(section1, section2) + " comes first in the book");
    }
}
