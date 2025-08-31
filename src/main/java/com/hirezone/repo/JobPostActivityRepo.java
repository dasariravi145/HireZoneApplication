package com.hirezone.repo;


import org.springframework.data.jpa.repository.JpaRepository;


import com.hirezone.entities.JobPostActivity;



public interface JobPostActivityRepo extends JpaRepository<JobPostActivity, Integer> {

	// retrieves list of jobs for a given recruiter id
	// combines/joins job post activity , job location, company
	// also includes a count of candidate/jobseeker who have applied for a given job
	// Note:- we have taken here Interface as a return type this is called Interface
	// projection
	// please read it from internet or gpt so you got clarity

	// IRecruiterJobs is interface we have created for some usefull method logics
//	@Query(value = "SELECT COUNT(s.user_id) AS totalCandidates, j.job_post_id, j.job_title, l.id AS locationId, l.city, l.state, l.country, c.id AS companyId, c.name "
//			+ "FROM job_post_activity j " + "INNER JOIN joblocation l ON j.joblocation_id = l.id "
//			+ "INNER JOIN job_company c ON j.jobcompany_id = c.id "
//			+ "LEFT JOIN job_seeker_apply s ON s.job = j.job_post_id " + "WHERE j.posted_by_id = :recruiter "
//			+ "GROUP BY j.job_post_id", nativeQuery = true)
//	List<IRecruiterJobs> getRecruterJobs(@Param("recruiter") int recruiter);
//
//	@Query(value = "select * from job_post_activity j INNER JOIN joblocation l on j.joblocation_id=l.id where "
//			+ "j.job_title LIKE %:job%" + " AND (l.city LIKE %:location%" + " OR l.country LIKE %:location%"
//			+ " OR l.state LIKE %:location%)" + " AND (j.job_type IN(:type))"
//			+ " AND (j.remote IN(:remote))", nativeQuery = true)
//	List<JobPostActivity> searchWithoutDate(@Param("job") String job, @Param("location") String location,
//			@Param("remote") List<String> remote, @Param("type") List<String> type);
//
//	@Query(value = "SELECT * from job_post_activity j INNER JOIN joblocation l on j.joblocation_id=l.id where "
//			+ "j.job_title LIKE %:job%" + " AND (l.city LIKE %:location%" + " OR l.country LIKE %:location%"
//			+ " OR l.state LIKE %:location%)" + " AND (j.job_type IN(:type))" + " AND (j.remote IN(:remote))"
//			+ " AND (posted_date>=:date) ", nativeQuery = true)
//	List<JobPostActivity> search(@Param("job") String job, @Param("location") String location,
//			@Param("remote") List<String> remote, @Param("type") List<String> type, @Param("date") LocalDate date);

}
