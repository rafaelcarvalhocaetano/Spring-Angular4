package consumindoApi.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
		
	private List<Topicos> listar() {

		Topicos t1 = new Topicos();
		Topicos t2 = new Topicos();
		Topicos t3 = new Topicos();

		t1.setNome("Rafael - 1");
		t1.setId("001");
		t1.setDescricao("Teste de consumo de API com SpringBoot");

		t2.setNome("Rafael - 2");
		t2.setId("002");
		t2.setDescricao("Teste de consumo de API com SpringBoot");

		t3.setNome("Rafael - 3");
		t3.setId("003");
		t3.setDescricao("Teste de consumo de API com SpringBoot");

		ArrayList<Topicos> itens = new ArrayList<Topicos>();
		itens.add(t1);
		itens.add(t2);
		itens.add(t3);

		return itens;
	}
	public List<Topicos> allTopicos(){
		return listar();
	}
	
	public Topicos getAllTopicos(String id){
		
		return listar().stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}


	
	
}
