package com.igniteedcuation.repositories;

import com.igniteedcuation.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
