/**
 * © Copyright SanSys Pvt. Ltd. All rights reserved. SanSys is a registered trademark and the SanSys graphic logo is a trademark of SanSys Pvt. Ltd.
 * SanSys reserves all the right for this source code. You should not modify or reuse without the noticing it to SanSys. And need to provide 
 * credits where applicable. Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an 
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific governing permissions and
 * limitations under the License.
 *
 * @author - Sanjeev
 * @version - 1.0
 * @CreatedOn - 09-Aug-2023 8:45:52 pm
 * @Usage - 
 *
 */

package com.kudlimath.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.kudlimath.model.Contact;
import com.kudlimath.repository.ContactRepository;
import jakarta.mail.MessagingException;

/**
 * 
 */

@Service
public class ContactService {
  
  @Autowired
  private ContactRepository contactRepository;
  
  @Autowired
  private EmailService emailService;

  /**
   * @param contact
   * @return
   */
  public com.kudlimath.entities.Contact createContactQuery(Contact contact) {
    com.kudlimath.entities.Contact contact2 = new com.kudlimath.entities.Contact();
    contact2.setEmail(contact.getEmail());
    contact2.setMessage(contact.getMessage());
    contact2.setMobile(contact.getMobile());
    contact2.setName(contact.getName());
    contact2.setSubject(contact.getSubject());
    contactRepository.save(contact2);    
    try {
      emailService.sendContactHtmlEmail(contact);
    } catch (MessagingException e) {
      e.printStackTrace();
    }
    return contact2;
  }
  
  
}
