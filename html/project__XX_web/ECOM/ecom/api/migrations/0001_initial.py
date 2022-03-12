import email
from unicodedata import name
from django.db import migrations
from phonenumbers import PhoneNumber
import phonenumbers
from api.user.models import CustomUser

class Migration(migrations.Migration):
    def seed_data(apps,schema_editor):
        user = CustomUser(
            name="lloyd",
            email="lloyd@tony.com",
            is_staff="True",
            is_superuser="True",
            phonenumber="0742441412",
            gender="Male"

            )

        user1 = CustomUser(
            name="tony",
            email="tony@katila11.com",
            is_staff="True",
            is_superuser="True",
            gender="Male"

        )
        user1.set_password("1234")
        user1.save()
        user.set_password("1234")
        user.save()

    dependencies = [
    ]

    operations = [
        migrations.RunPython(seed_data),
    ]