package com.ecome.demoecome.Reposistory;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ecome.demoecome.Entity.DemoOrder;

public interface OrderRepository extends JpaRepository<DemoOrder, Long> {

	Page<DemoOrder> findAll(Pageable pageable);

	
}
