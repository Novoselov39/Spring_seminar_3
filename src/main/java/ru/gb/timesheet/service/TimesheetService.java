package ru.gb.timesheet.service;

import org.springframework.stereotype.Service;
import ru.gb.timesheet.model.Timesheet;
import ru.gb.timesheet.repository.TimesheetRepository;

import java.util.List;
import java.util.Optional;

@Service // то же самое, что и Component
public class TimesheetService {

  private final TimesheetRepository repository;

  public TimesheetService(TimesheetRepository repository) {
    this.repository = repository;
  }

  public Optional<Timesheet> getById(Long id) {
    return repository.getById(id);
  }

  public List<Timesheet> getAll() {
    return repository.getAll();
  }

  public Timesheet create(Timesheet timesheet, ProjectService projectService) {
    return repository.create(timesheet, projectService);
  }

  public void delete(Long id) {
    repository.delete(id);
  }

}
