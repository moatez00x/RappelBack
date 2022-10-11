package Rappel.Back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Rappel.Back.domain.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

}
