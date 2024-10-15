package kz.alishev.lab_2.controller;
import kz.alishev.lab_2.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import kz.alishev.lab_2.model.*;


import java.util.List;






@RestController
@RequestMapping("/api/v1/user")
@AllArgsConstructor
public class StudentController {
    private final StudentService service;

    @GetMapping("")
    public List<Student> findAllStudents() {

        return service.findAllStudents();
    }
    @PostMapping("save_user")
    public String saveStudent( @RequestBody Student student) {
        service.saveStudent(student);
        return "Student saved successfully";
    }

//    @PostMapping("/save_student")
//    public ResponseEntity<Map<String, String>> saveStudentProgrammatic(@RequestBody Student student) {
//        // Создание ValidatorFactory и Validator
//        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//        Validator validator = factory.getValidator();
//
//        // Выполняем валидацию объекта student
//        Set<ConstraintViolation<Student>> violations = validator.validate(student);
//
//        if (!violations.isEmpty()) {
//            // Если есть ошибки валидации, собираем их и возвращаем клиенту
//            Map<String, String> errors = new HashMap<>();
//            for (ConstraintViolation<Student> violation : violations) {
//                errors.put(violation.getPropertyPath().toString(), violation.getMessage());
//            }
//            return ResponseEntity.badRequest().body(errors);
//        }
//
//        // Если ошибок валидации нет, сохраняем студента
//        service.saveStudent(student);
//
//        // Возвращаем успешный ответ
//        Map<String, String> response = new HashMap<>();
//        response.put("message", "Student saved successfully");
//        return new ResponseEntity<>(response, HttpStatus.CREATED);
//    }
//
//
//    // Метод, который будет выбрасывать исключение
//    @GetMapping("throw_exception")
//    public String throwException() {
//        throw new RuntimeException("This is a custom exception message.");
//    }
//
//    // Обработчик исключений
//    @ExceptionHandler(RuntimeException.class)
//    public ResponseEntity<Map<String, String>> handleRuntimeException(RuntimeException ex) {
//        Map<String, String> errorResponse = new HashMap<>();
//        errorResponse.put("error", ex.getMessage());
//        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
//    }


    // 4. Using Path Variables
    @GetMapping("/{email}")
    public Student findStudentByEmail(@PathVariable String email) {
        return service.findStudentByEmail(email);
    }

    // 5. Create a PUT Method to Update a Resource
    @PutMapping("update_user")
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    // 6. Delete a Resource with a DELETE Request
    @DeleteMapping("delete_user/{email}")
    public void deleteStudent(@PathVariable String email) {
        service.deleteStudent(email);
    }
























}
