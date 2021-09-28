package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NothingTest {
  private Nothing fixture;

  @BeforeEach
  public void init() {
    fixture = new Nothing();
  }

  @Test
  public void shouldDoNothingFoo() {
    fixture.foo();
  }
}
