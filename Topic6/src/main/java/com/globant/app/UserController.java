package com.globant.app;

import java.util.Collection;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.globant.model.User;
import com.globant.services.UserService;
import com.globant.services.UserServiceImpl;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private UserService userService = new UserServiceImpl();

	@RequestMapping("/getUsers")
	@ApiOperation(value = "Finds all users", nickname = "Get all users")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success") })
	public Collection<User> getUsers() {
		return userService.getUsers();
	}
	
	@RequestMapping("/findByRealname")
	@ApiOperation(value = "Find users by real name", nickname = "Users by realname")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 404, message = "Not Found"), })
	public ResponseEntity<?> findByName(@RequestParam(value="userName", required=true) String name){
		Collection<User> usersfound = userService.findByRealName(name);
		if (!(usersfound == null))
			return new ResponseEntity<String>("No users were found", HttpStatus.BAD_REQUEST);
		else
			return new ResponseEntity<Collection<User>>(usersfound, HttpStatus.OK);
	}
	
	@RequestMapping("/findByNickname")
	@ApiOperation(value = "Find users by their nickname", nickname = "Users by nickname")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 404, message = "Not Found"), })
	public ResponseEntity<?> findByNickname(@RequestParam(value="nickname", required=true) String nickname){
		Collection<User> usersfound = userService.findByNickname(nickname);
		if (!(usersfound == null))
			return new ResponseEntity<String>("No users were found", HttpStatus.BAD_REQUEST);
		else
			return new ResponseEntity<Collection<User>>(usersfound, HttpStatus.OK);
	}
	
	@RequestMapping("/addUser")
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value = "Adds a new user", nickname = "Add user")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success") })
	public ResponseEntity<?> addUser(@RequestParam(value="username", required=true) String username,
			@RequestParam(value="password") String password,
			@RequestParam(value="nickname") String nickname,
			@RequestParam(value="realname") String realname){
		if (userService.validateUser(username))
			return new ResponseEntity<String>("Username already exists", HttpStatus.BAD_REQUEST);
		else{
			User user = new User(username, password, nickname, realname);
			userService.createUser(user);
			return new ResponseEntity<String>("User added successfully", HttpStatus.OK);
		}
	}
	
	@RequestMapping("/deleteUser")
	@ApiOperation(value = "Deletes a user", nickname = "Delete user")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success") })
	public ResponseEntity<?> deleteUser(@RequestParam(value="username", required=true) String username){
		if (userService.validateUser(username)){
			User user = new User(username, null, null, null);
			userService.deleteUser(user);
			return new ResponseEntity<String>("User removed successfully", HttpStatus.OK);
		}
		else
			return new ResponseEntity<String>("Username not found", HttpStatus.BAD_REQUEST);
	}
	
	@RequestMapping("/updateUserNickname")
	@ApiOperation(value = "Updates a user nickname", nickname = "Update user nickname")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success") })
	public ResponseEntity<String> updateUserNickname(@RequestParam(value="username", required=true) String username,
			@RequestParam(value="nickname", required=true) String nickname){
		if (userService.validateUser(username)){
			userService.updateUserNickname(username, nickname);
			return new ResponseEntity<String>("User updated successfully", HttpStatus.OK);
		}
		else
			return new ResponseEntity<String>("Username not found", HttpStatus.BAD_REQUEST);
	}
	
}
