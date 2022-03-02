package com.mycompany.myapp.dummy.infrastructure.secondary;

import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.UnitTest;
import com.mycompany.myapp.dummy.domain.Dummy;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@UnitTest
@ExtendWith(SpringExtension.class)
class DummyInMemoryRepositoryTest {

  @InjectMocks
  DummyInMemoryRepository repository;

  @BeforeEach
  void setUp() {
    repository.clear();
  }

  @Test
  void shouldList() {
    List<Dummy> result = repository.list();

    assertThat(result).isEmpty();
  }

  @Test
  void shouldAddAndList() {
    Dummy dummy = Dummy.of("beer");

    repository.add(dummy);

    List<Dummy> result = repository.list();
    assertThat(result).contains(dummy);
  }

  @Test
  void shouldAddOnceAndList() {
    Dummy dummy = Dummy.of("beer");

    repository.add(dummy);
    repository.add(dummy);

    List<Dummy> result = repository.list();
    assertThat(result).hasSize(1).contains(dummy);
  }
}
