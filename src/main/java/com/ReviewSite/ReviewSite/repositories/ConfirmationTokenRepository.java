package com.ReviewSite.ReviewSite.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ReviewSite.ReviewSite.user.ConfirmationToken;
//confirmation token repository
@Repository
interface ConfirmationTokenRepository extends CrudRepository<ConfirmationToken, Long> {

}