package vendas;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class main {
	
	public static void main(String[] args) {
		
		List<String> compras = new ArrayList<>();
		List<String> vendas = new ArrayList<>();
		double din = 1000;
		double dinv = 0;
		int parafusos = 0;
		int roscas = 0;
		int buchas = 0;
		int chave_fenda = 0;
		int chave_philips = 0;
		int cabo = 0;
		
		for(;;) {
			int op = 0;
			int op2 = 0;
			int unid = 0;
			
			op = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção: \n\n"
					+ "1 - Fornecimento de produtos\n"
					+ "2 - Estoque\n"
					+ "3 - Consultar dinheiro\n"
					+ "4 - Vender\n"
					+ "5 - Consultar vendas\n"
					+ "6 - Sair\n"));
			
			if(op==1){
				op2 = Integer.parseInt(JOptionPane.showInputDialog(
						"1 - Parafusos - 0,10R$\n"
						+ "2 - Roscas - 0,10R$\n"
						+ "3 - Buchas - 0,5R$\n"
						+ "4 - Chaves de fenda - 2,00R$\n"
						+ "5 - Chaves philips - 2,00R$\n"
						+ "6 - Cabo(metro) - 0,25R$\n"
						));				
				if(op2==1) {
					unid = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: \n"));
					compras.add("Parafusos "+unid);
					din -= ((0.10)*unid);
					System.out.println(din);
					parafusos += unid;
				}else if(op2==2){
					unid = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: \n"));
					compras.add("Roscas "+unid);	
					din -= (0.10)*unid;
					roscas += unid;
				}else if(op2==3){
					unid = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: \n"));
					compras.add("Buchas "+unid);	
					din -= (0.05)*unid;
					buchas += unid;
				}else if(op2==4){
					unid = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: \n"));
					compras.add("Chaves de fenda "+unid);	
					din -= 2*unid;
					chave_fenda += unid;
				}else if(op2==5){
					unid = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: \n"));
					compras.add("Chaves philips "+unid);
					din -= 2*unid;
					chave_philips += unid;
				}else if(op2==6){
					unid = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: \n"));
					compras.add("Cabo(metro) "+unid);	
					din -= (0.25)*unid;
					cabo += unid;
				}else{
					JOptionPane.showMessageDialog(null, "Opção inválida!");
				}
			}else if(op==2){
				JOptionPane.showMessageDialog(null,
						"1 - Parafusos -- "+parafusos+"\n"
						+ "2 - Roscas -- "+roscas+"\n"
						+ "3 - Buchas -- "+buchas+"\n"
						+ "4 - Chaves de fenda -- "+chave_fenda+"\n"
						+ "5 - Chaves philips -- "+chave_philips+"\n"
						+ "6 - Cabo(metro) -- "+cabo+"\n");
			}else if(op==3){
				JOptionPane.showMessageDialog(null, "Seu dinheiro atual é: \n\n"+din+"R$");
			}else if(op==4){
				op2 = Integer.parseInt(JOptionPane.showInputDialog(
						"1 - Parafusos - 0,25R$\n"
						+ "2 - Roscas - 0,25R$\n"
						+ "3 - Buchas - 0,15R$\n"
						+ "4 - Chaves de fenda - 5,00R$\n"
						+ "5 - Chaves philips - 5,00R$\n"
						+ "6 - Cabo(metro) - 1,00R$\n"));
				if(op2==1) {
					unid = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: \n"));
					if(parafusos>=unid){
						vendas.add("Parafusos "+unid);
						din += 0.25*unid;
						dinv += 0.25*unid;
					}else{
						JOptionPane.showMessageDialog(null, "Não há essa quantidade em estoque!");
					}
				}else if(op2==2){
					unid = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: \n"));
					if(roscas>=unid){
						vendas.add("Roscas "+unid);	
						din += 0.25*unid;
						dinv += 0.25*unid;
					}else{
						JOptionPane.showMessageDialog(null, "Não há essa quantidade em estoque!");
					}
				}else if(op2==3){
					unid = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: \n"));
					if(buchas>=unid){
						vendas.add("Buchas "+unid);	
						din += 0.15*unid;
						dinv += 0.15*unid;
					}else{
						JOptionPane.showMessageDialog(null, "Não há essa quantidade em estoque!");
					}
				}else if(op2==4){
					unid = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: \n"));
					if(chave_fenda>=unid){
						vendas.add("Chaves de fenda "+unid);	
						din += 5*unid;
						dinv += 5*unid;
					}else{
						JOptionPane.showMessageDialog(null, "Não há essa quantidade em estoque!");
					}		
				}else if(op2==5){
					unid = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: \n"));
					if(chave_philips>=unid){
						vendas.add("Chaves philips "+unid);	
						din += 5*unid;
						dinv += 5*unid;
					}else{
						JOptionPane.showMessageDialog(null, "Não há essa quantidade em estoque!");
					}	
				}else if(op2==6){
					unid = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: \n"));
					if(cabo>=unid){
						vendas.add("Cabo(metro) "+unid);
						din += 1*unid;
						dinv += 1*unid;
					}else{
						JOptionPane.showMessageDialog(null, "Não há essa quantidade em estoque!");
					}
				}else{
					JOptionPane.showMessageDialog(null, "Opção inválida!");
				}
			}else if(op==5) {
				JOptionPane.showMessageDialog(null, "Vendas: \n\n"
						+ "" + vendas+"\n\n"+dinv+"R$");
				
			}else if(op==6){
				JOptionPane.showMessageDialog(null, "Finalizando...");
				break;
			}
			else{
				JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
		}
	}
}
