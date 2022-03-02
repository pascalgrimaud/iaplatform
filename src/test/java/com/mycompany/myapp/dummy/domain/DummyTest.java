package com.mycompany.myapp.dummy.domain;

import static org.assertj.core.api.Assertions.*;

import com.mycompany.myapp.UnitTest;
import com.mycompany.myapp.error.domain.MissingMandatoryValueException;
import org.junit.jupiter.api.Test;

@UnitTest
class DummyTest {

  @Test
  void shouldBuild() {
    Dummy dummy = new Dummy("chips");

    assertThat(dummy.name()).isEqualTo("chips");
  }

  @Test
  void shouldOf() {
    Dummy dummy = Dummy.of("chips");

    assertThat(dummy.name()).isEqualTo("chips");
  }

  @Test
  void shouldNotBuildWithNullName() {
    assertThatThrownBy(() -> new Dummy(null)).isExactlyInstanceOf(MissingMandatoryValueException.class).hasMessageContaining("name");
  }

  @Test
  void shouldNotBuildWithBlankName() {
    assertThatThrownBy(() -> new Dummy(" ")).isExactlyInstanceOf(MissingMandatoryValueException.class).hasMessageContaining("name");
  }
}
