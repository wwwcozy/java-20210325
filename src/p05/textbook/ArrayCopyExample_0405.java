package p05.textbook;

public class ArrayCopyExample_0405 {
	public static void main(String[] args) {
		String[] oldStrArray = {"Java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for( int i = 0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}
}
