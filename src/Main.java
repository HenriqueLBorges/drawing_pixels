
public class Main {
	public static void main(String Args []){
		int imagem[] = {0xF0, 0x90, 0xF0, 0x90, 0xF0};
		for (int i = 0; i < imagem.length; i++) //Percorre a altura do sprite
		{
			int linha = imagem[i];
			for (int j = 0; j < 8; j++)
			{
				int pixel = linha &(0x80 >> j);
				if (pixel != 0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.print("  ");
			for(int linha_x = 0; linha_x < 8; linha_x++){
				int pixel = linha & (0x80 >> linha_x);
				if (pixel != 0) {
					System.out.print("X");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
