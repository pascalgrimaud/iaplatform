package com.mycompany.myapp.dummy.domain;

import com.mycompany.myapp.error.domain.Assert;

public record Dummy(String name) {
  public Dummy {
    Assert.notBlank("name", name);
  }

  public static Dummy of(String name) {
    return new Dummy(name);
  }
}
