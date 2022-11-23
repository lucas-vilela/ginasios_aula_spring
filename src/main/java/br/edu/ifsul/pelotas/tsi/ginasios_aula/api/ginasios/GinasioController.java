package br.edu.ifsul.pelotas.tsi.ginasios_aula.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/ginasios")





public class GinasioController {

    @GetMapping
    public ResponseEntity<String> selectAll(){
        return ResponseEntity.ok("Todos ginásios");
    }
    @GetMapping("{id}")
    public ResponseEntity<String> selectById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(" Ginásio de id: " +id);
    }

    @GetMapping("/nome/{nome}")
    public ResponseEntity<String> selectByNome(@PathVariable("nome") String nome) {
        return ResponseEntity.ok(" Ginásio de nome: " + nome);
    }

    @PostMapping
    public ResponseEntity<String> insert(@RequestBody String ginasio){
        return ResponseEntity.ok("Novo ginásio: " + ginasio);
    }

    @PutMapping("{id}")
    public ResponseEntity<String> update(@PathVariable("id") Long id, @RequestBody String ginasio){
        return ResponseEntity.ok("Ginásio de id:" + id + " alterado para:" + ginasio);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id){
        return ResponseEntity.ok("Ginásio " + id + " deletado!");
    }

}
