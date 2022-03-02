package com.mycompany.myapp.dummy.application;

import com.mycompany.myapp.dummy.domain.Dummy;
import com.mycompany.myapp.dummy.domain.DummyRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DummyApplicationService {

  private final DummyRepository dummyRepository;

  public DummyApplicationService(DummyRepository dummyRepository) {
    this.dummyRepository = dummyRepository;
  }

  public List<Dummy> list() {
    return dummyRepository.list();
  }

  public void add(Dummy dummy) {
    dummyRepository.add(dummy);
  }

  public void clear() {
    dummyRepository.clear();
  }
}
