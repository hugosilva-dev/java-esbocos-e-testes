package hugo.project.dscatalog.resources;

import hugo.project.dscatalog.entities.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/*
        O backend vai disponibilizar alguns recursos para o frontend,
    esses recursos são implementados pelos controladores REST, que utilizam
    o protocolo HTTP para estabelecer a comunicação dos dados.
 */
@RestController
@RequestMapping(value = "/categories")
//      RequestMapping: necessário incluir qual a rota REST do recurso.
public class CategoryResource {

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = new ArrayList<>();
        list.add(new Category(1L,"Books"));
        list.add(new Category(2L, "Electronics"));
        return ResponseEntity.ok(list);

    }

}
