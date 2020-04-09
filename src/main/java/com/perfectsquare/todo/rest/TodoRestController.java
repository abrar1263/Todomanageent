package com.perfectsquare.todo.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.perfectsquare.model.Todo;
import com.perfectsquare.todo.service.TodoService;

@RestController
public class TodoRestController {
	@Autowired
	private TodoService service;

	@RequestMapping(value = "/todo/", method = RequestMethod.GET)
	public List<Todo> listAllTodos() {
		List<Todo> users = service.retrieveTodos("Abrar");
		return users;
	}

	@RequestMapping(value = "/todo/{id}", method = RequestMethod.GET)
	public Todo retrieveTodo(@PathVariable("id") int id) {
		return service.retrieveTodo(id);
	}
}