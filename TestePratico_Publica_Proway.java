package pacotePrincipal;

import java.util.Scanner;
import java.util.ArrayList;

public class TestePratico_Publica_Proway {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		int minPontos = 999, maxPontos = 0, jogo = 0, ponto = 0, indiceRecordeMax = 0, indiceRecordeMin = 0;
		ArrayList<Integer> pontos = new ArrayList<>();
		ArrayList<Integer> jogos = new ArrayList<>();
		ArrayList<Integer> recordeMin = new ArrayList<>();
		ArrayList<Integer> recordeMax = new ArrayList<>();
		ArrayList<String> tabela = new ArrayList<>();
		int c = 0;
		byte opcao = 0;

		while (opcao == 0) {
			System.out.print("Escolha uma opção: \n");
			System.out.print("	1 para adicionar um jogo. \n");
			System.out.print("	2 para conferir a tabela de jogos. \n");
			System.out.print("	3 para finalizar o programa. \n");
			System.out.print("Digite sua opção: ");
			opcao = dados.nextByte();
			switch (opcao) {
			case 1:
				System.out.print("Informe o placar do jogo: ");
				ponto = dados.nextInt();
				if (ponto >= 0 && ponto < 1000) {
					pontos.add(ponto);
					jogos.add(jogo + 1);
					jogo += 1;
					if (ponto > maxPontos) {
						maxPontos = ponto;
						recordeMax.add(indiceRecordeMax);
					}
					if (ponto < minPontos) {
						minPontos = ponto;
						recordeMin.add(indiceRecordeMin);
					}
					indiceRecordeMax += 1;
					if (recordeMin.size() > 0) {
						indiceRecordeMin += 1;
					}
					tabela.add("Jogo: " + jogos.get(c) + " | Pontos: " + pontos.get(c) + " | Máximo de Pontos:"
							+ maxPontos + " | Mínimo de Pontos: " + minPontos + " | Recorde Máximo de Pontos: "
							+ (recordeMax.size() - 1) + " | Recorde Mínimo de Pontos: " + (recordeMin.size() - 1));
					c += 1;
					opcao = 0;
					break;
				} else {
					System.out.print("Placar do jogo inválido. \n");
					opcao = 0;
					break;
				}
			case 2:
				for (int i = 0; i < tabela.size(); i++) {
					System.out.println(tabela.get(i));
				}
				opcao = 0;
				break;
			case 3:
				System.out.println("Finalizando o programa...");
				break;
			default:
				System.out.println("Opcão inválida!");
				opcao = 0;
				break;

			}
		}
		dados.close();
	}

}
