package com.mycompany.myapp.dummy.application;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import com.mycompany.myapp.IntegrationTest;
import com.mycompany.myapp.dummy.domain.Dummy;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@IntegrationTest
class DummyApplicationServiceIT {

  @Autowired
  DummyApplicationService service;

  @BeforeEach
  void setUp() {
    service.clear();
  }

  @Test
  void shouldList() {
    List<Dummy> result = service.list();

    assertThat(result).isEmpty();
  }

  @Test
  void shouldAddAndList() {
    Dummy dummy = Dummy.of("beer");

    service.add(dummy);

    List<Dummy> result = service.list();
    assertThat(result).contains(dummy);
  }
}
