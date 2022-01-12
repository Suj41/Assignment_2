 package searchingHo;

public class BinarySrc extends Searching {

    @Override
    protected boolean search() {
        boolean flag = false;
        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (arr[mid] == searchValue) {
                flag = true;
                break;
            } else if (arr[mid] > searchValue) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }

        }
        return flag;
    }
}