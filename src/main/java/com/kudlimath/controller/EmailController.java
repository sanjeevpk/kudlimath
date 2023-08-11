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
 * @CreatedOn - 09-Aug-2023 1:41:24 am
 * @Usage - 
 *
 */

package com.kudlimath.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.kudlimath.model.Contact;
import com.kudlimath.service.EmailService;
import jakarta.mail.MessagingException;

/**
 * 
 */

@RestController
public class EmailController {
  
  @Autowired
  private EmailService emailService;
  
  @GetMapping("/email")
  public String sendEmail(@RequestBody Contact contact) {
    try {
      emailService.sendHtmlEmail(contact);
    } catch (MessagingException e) {
      e.printStackTrace();
    }
    return "Success";
  }
}
