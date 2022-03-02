package com.mycompany.myapp.dummy.infrastructure.primary.rest;

import com.mycompany.myapp.dummy.application.DummyApplicationService;
import com.mycompany.myapp.dummy.domain.Dummy;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dummy")
class DummyResource {

  private final DummyApplicationService dummyApplicationService;

  public DummyResource(DummyApplicationService dummyApplicationService) {
    this.dummyApplicationService = dummyApplicationService;
  }

  @GetMapping
  public List<Dummy> list() {
    return dummyApplicationService.list();
  }

  @PostMapping
  public void create(@RequestBody Dummy dummy) {
    dummyApplicationService.add(dummy);
  }

  @DeleteMapping
  public void clear() {
    dummyApplicationService.clear();
  }
}
