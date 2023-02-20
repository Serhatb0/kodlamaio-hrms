package com.biricik.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biricik.devs.business.abstracts.ProgrammingLanguageTechnologieService;
import com.biricik.devs.business.requests.ProgrammingLanguageTechnologieRequests.CreateProgrammingLanguageTechnologieRequest;
import com.biricik.devs.business.requests.ProgrammingLanguageTechnologieRequests.UpdateProgrammingLanguageTechnologieRequest;
import com.biricik.devs.business.responses.ProgrammingLanguageTechnologieResponses.CreateProgrammingLanguageTechnologieResponse;
import com.biricik.devs.business.responses.ProgrammingLanguageTechnologieResponses.GetAllProgrammingLanguagesTechnologieResponse;
import com.biricik.devs.business.responses.ProgrammingLanguageTechnologieResponses.UpdateProgrammingLanguageTechnologieResponse;
import com.biricik.devs.core.utilities.result.DataResult;
import com.biricik.devs.core.utilities.result.Result;

@RestController
@RequestMapping("/api/programming_language_technologies")
public class ProgrammingLanguageTechnologiesController {

	private final ProgrammingLanguageTechnologieService programmingLanguageTechnologieService;

	@Autowired
	public ProgrammingLanguageTechnologiesController(
			ProgrammingLanguageTechnologieService programmingLanguageTechnologieService) {
		this.programmingLanguageTechnologieService = programmingLanguageTechnologieService;
	}

	@PostMapping()
	public DataResult<CreateProgrammingLanguageTechnologieResponse> addProgrammingLanguageTechnologie(
			@RequestBody CreateProgrammingLanguageTechnologieRequest createProgrammingLanguageTechnologieRequest) {
		return programmingLanguageTechnologieService
				.addProgrammingLanguageTechnologie(createProgrammingLanguageTechnologieRequest);
	}

	@GetMapping()
	public DataResult<List<GetAllProgrammingLanguagesTechnologieResponse>> getProgrammingLanguageTechnologies() {
		return programmingLanguageTechnologieService.getAllProgrammingLanguageTechnologies();
	}

	@DeleteMapping("/{id}")
	public Result deleteProgrammingLanguageTechnologie(@PathVariable int id) {
		return programmingLanguageTechnologieService.deleteProgrammingLanguageTechnologie(id);
	}

	@PutMapping()
	public DataResult<UpdateProgrammingLanguageTechnologieResponse> updateProgrammingLanguageTechnologie(

			@RequestBody UpdateProgrammingLanguageTechnologieRequest updateProgrammingLanguageTechnologieRequest) {
		return programmingLanguageTechnologieService
				.updateProgrammingLanguageTechnologies(updateProgrammingLanguageTechnologieRequest);
	}

}
