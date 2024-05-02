package via.doc1.devopsdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import via.doc1.devopsdemo.model.TeamMember;

public interface TeamMemberRepository extends JpaRepository<TeamMember, String> { }