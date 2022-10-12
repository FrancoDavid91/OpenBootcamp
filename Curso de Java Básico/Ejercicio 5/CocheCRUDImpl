package Curso_de_Java_Básico.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{
    
     private List<Coche> coches = new ArrayList<> ();
    
    @Override
    public void save(Coche coche) {
        coches.add(coche);
    }

    @Override
    public void delete(Coche coche) {
        coches.remove(coche);
    }

    @Override
    public List<Coche> fillAll() {
      coches.forEach(System.out::println);
      return coches;
    }
     
}
        
