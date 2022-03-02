package com.mycompany.myapp.dummy.infrastructure.secondary;

import com.mycompany.myapp.dummy.domain.Dummy;
import com.mycompany.myapp.dummy.domain.DummyRepository;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Repository;

@Repository
public class DummyInMemoryRepository implements DummyRepository {

  private Map<String, Dummy> dummys = new ConcurrentHashMap<>();

  @Override
  public List<Dummy> list() {
    return dummys.values().stream().toList();
  }

  @Override
  public void add(Dummy dummy) {
    dummys.put(dummy.name(), dummy);
  }

  @Override
  public void clear() {
    dummys = new ConcurrentHashMap<>();
  }
}
